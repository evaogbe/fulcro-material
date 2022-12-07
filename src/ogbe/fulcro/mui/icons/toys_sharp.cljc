(ns ogbe.fulcro.mui.icons.toys-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ToysSharp" :default ToysSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toys-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToysSharp)))