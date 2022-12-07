(ns ogbe.fulcro.mui.icons.star-outline
  #?(:cljs (:require
            ["@mui/icons-material/StarOutline" :default StarOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarOutline)))