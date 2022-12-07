(ns ogbe.fulcro.mui.icons.flip-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FlipSharp" :default FlipSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipSharp)))