(ns ogbe.fulcro.mui.icons.av-timer
  #?(:cljs (:require
            ["@mui/icons-material/AvTimer" :default AvTimer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-av-timer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AvTimer)))