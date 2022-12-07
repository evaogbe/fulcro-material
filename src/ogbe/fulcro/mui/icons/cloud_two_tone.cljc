(ns ogbe.fulcro.mui.icons.cloud-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CloudTwoTone" :default CloudTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudTwoTone)))