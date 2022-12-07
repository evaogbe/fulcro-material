(ns ogbe.fulcro.mui.icons.class-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ClassSharp" :default ClassSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-class-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClassSharp)))