(ns ogbe.fulcro.mui.icons.cloud-done
  #?(:cljs (:require
            ["@mui/icons-material/CloudDone" :default CloudDone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-done
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudDone)))