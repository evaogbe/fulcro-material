(ns ogbe.fulcro.mui.icons.flood-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FloodSharp" :default FloodSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flood-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FloodSharp)))