(ns ogbe.fulcro.mui.icons.rectangle-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RectangleSharp" :default RectangleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rectangle-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RectangleSharp)))