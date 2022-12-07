(ns ogbe.fulcro.mui.icons.cloud-off
  #?(:cljs (:require
            ["@mui/icons-material/CloudOff" :default CloudOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudOff)))