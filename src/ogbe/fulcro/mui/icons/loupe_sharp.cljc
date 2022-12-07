(ns ogbe.fulcro.mui.icons.loupe-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LoupeSharp" :default LoupeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loupe-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoupeSharp)))