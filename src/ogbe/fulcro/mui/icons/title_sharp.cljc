(ns ogbe.fulcro.mui.icons.title-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TitleSharp" :default TitleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-title-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TitleSharp)))