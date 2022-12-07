(ns ogbe.fulcro.mui.icons.star-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/StarTwoTone" :default StarTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarTwoTone)))