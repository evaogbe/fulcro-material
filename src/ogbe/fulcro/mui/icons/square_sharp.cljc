(ns ogbe.fulcro.mui.icons.square-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SquareSharp" :default SquareSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-square-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SquareSharp)))