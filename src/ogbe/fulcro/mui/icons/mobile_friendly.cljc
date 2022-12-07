(ns ogbe.fulcro.mui.icons.mobile-friendly
  #?(:cljs (:require
            ["@mui/icons-material/MobileFriendly" :default MobileFriendly]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mobile-friendly
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MobileFriendly)))