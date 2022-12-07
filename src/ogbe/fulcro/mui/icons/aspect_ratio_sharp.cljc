(ns ogbe.fulcro.mui.icons.aspect-ratio-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AspectRatioSharp" :default AspectRatioSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-aspect-ratio-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AspectRatioSharp)))