(ns ogbe.fulcro.mui.icons.cloud-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CloudSharp" :default CloudSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudSharp)))