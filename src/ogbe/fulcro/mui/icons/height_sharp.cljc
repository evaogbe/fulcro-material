(ns ogbe.fulcro.mui.icons.height-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HeightSharp" :default HeightSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-height-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HeightSharp)))