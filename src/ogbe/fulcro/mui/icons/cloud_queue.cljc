(ns ogbe.fulcro.mui.icons.cloud-queue
  #?(:cljs (:require
            ["@mui/icons-material/CloudQueue" :default CloudQueue]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-queue
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudQueue)))