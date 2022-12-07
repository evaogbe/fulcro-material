(ns ogbe.fulcro.mui.icons.verified-user-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VerifiedUserRounded" :default VerifiedUserRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-verified-user-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VerifiedUserRounded)))