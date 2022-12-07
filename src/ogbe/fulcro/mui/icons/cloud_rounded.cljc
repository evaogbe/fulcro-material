(ns ogbe.fulcro.mui.icons.cloud-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CloudRounded" :default CloudRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudRounded)))