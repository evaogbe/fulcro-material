(ns ogbe.fulcro.mui.icons.block-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BlockSharp" :default BlockSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-block-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlockSharp)))