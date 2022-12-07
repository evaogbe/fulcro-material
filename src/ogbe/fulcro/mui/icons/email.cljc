(ns ogbe.fulcro.mui.icons.email
  #?(:cljs (:require
            ["@mui/icons-material/Email" :default Email]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-email
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Email)))