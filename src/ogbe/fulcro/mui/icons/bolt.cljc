(ns ogbe.fulcro.mui.icons.bolt
  #?(:cljs (:require
            ["@mui/icons-material/Bolt" :default Bolt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bolt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bolt)))