(ns ogbe.fulcro.mui.icons.email-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EmailRounded" :default EmailRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-email-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmailRounded)))