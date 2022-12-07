(ns ogbe.fulcro.mui.icons.card-giftcard
  #?(:cljs (:require
            ["@mui/icons-material/CardGiftcard" :default CardGiftcard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-card-giftcard
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CardGiftcard)))