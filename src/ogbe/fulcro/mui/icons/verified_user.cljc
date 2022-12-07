(ns ogbe.fulcro.mui.icons.verified-user
  #?(:cljs (:require
            ["@mui/icons-material/VerifiedUser" :default VerifiedUser]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-verified-user
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VerifiedUser)))