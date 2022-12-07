(ns ogbe.fulcro.mui.icons.alternate-email
  #?(:cljs (:require
            ["@mui/icons-material/AlternateEmail" :default AlternateEmail]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alternate-email
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlternateEmail)))