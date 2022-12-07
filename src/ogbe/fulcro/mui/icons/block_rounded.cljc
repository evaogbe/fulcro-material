(ns ogbe.fulcro.mui.icons.block-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BlockRounded" :default BlockRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-block-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlockRounded)))