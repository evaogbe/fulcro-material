(ns ogbe.fulcro.mui.icons.launch
  #?(:cljs (:require
            ["@mui/icons-material/Launch" :default Launch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-launch
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Launch)))