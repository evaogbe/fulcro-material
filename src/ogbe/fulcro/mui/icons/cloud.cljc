(ns ogbe.fulcro.mui.icons.cloud
  #?(:cljs (:require
            ["@mui/icons-material/Cloud" :default Cloud]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cloud)))