(ns ogbe.fulcro.mui.icons.traffic
  #?(:cljs (:require
            ["@mui/icons-material/Traffic" :default Traffic]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-traffic
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Traffic)))