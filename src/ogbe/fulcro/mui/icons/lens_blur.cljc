(ns ogbe.fulcro.mui.icons.lens-blur
  #?(:cljs (:require
            ["@mui/icons-material/LensBlur" :default LensBlur]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lens-blur
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LensBlur)))