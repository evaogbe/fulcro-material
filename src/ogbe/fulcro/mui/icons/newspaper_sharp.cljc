(ns ogbe.fulcro.mui.icons.newspaper-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NewspaperSharp" :default NewspaperSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-newspaper-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NewspaperSharp)))