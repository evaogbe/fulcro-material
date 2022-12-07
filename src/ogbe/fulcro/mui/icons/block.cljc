(ns ogbe.fulcro.mui.icons.block
  #?(:cljs (:require
            ["@mui/icons-material/Block" :default Block]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-block
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Block)))