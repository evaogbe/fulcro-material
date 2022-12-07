(ns ogbe.fulcro.mui.icons.cloud-circle
  #?(:cljs (:require
            ["@mui/icons-material/CloudCircle" :default CloudCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudCircle)))