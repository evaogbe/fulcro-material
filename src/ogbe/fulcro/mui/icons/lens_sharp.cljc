(ns ogbe.fulcro.mui.icons.lens-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LensSharp" :default LensSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lens-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LensSharp)))