(ns ogbe.fulcro.mui.icons.cloud-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CloudOutlined" :default CloudOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudOutlined)))