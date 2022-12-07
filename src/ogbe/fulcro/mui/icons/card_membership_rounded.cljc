(ns ogbe.fulcro.mui.icons.card-membership-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CardMembershipRounded" :default CardMembershipRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-card-membership-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CardMembershipRounded)))