(ns ogbe.fulcro.mui.icons.stars-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/StarsTwoTone" :default StarsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stars-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarsTwoTone)))