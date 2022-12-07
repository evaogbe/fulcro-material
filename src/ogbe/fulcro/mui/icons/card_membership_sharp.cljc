(ns ogbe.fulcro.mui.icons.card-membership-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CardMembershipSharp" :default CardMembershipSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-card-membership-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CardMembershipSharp)))