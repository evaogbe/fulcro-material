(ns ogbe.fulcro.mui.icons.cloud-sync
  #?(:cljs (:require
            ["@mui/icons-material/CloudSync" :default CloudSync]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-sync
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudSync)))