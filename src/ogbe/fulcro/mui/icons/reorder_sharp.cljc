(ns ogbe.fulcro.mui.icons.reorder-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ReorderSharp" :default ReorderSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reorder-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReorderSharp)))