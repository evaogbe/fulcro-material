(ns ogbe.fulcro.mui.icons.block-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BlockTwoTone" :default BlockTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-block-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlockTwoTone)))