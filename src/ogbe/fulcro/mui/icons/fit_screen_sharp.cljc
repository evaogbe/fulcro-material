(ns ogbe.fulcro.mui.icons.fit-screen-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FitScreenSharp" :default FitScreenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fit-screen-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FitScreenSharp)))