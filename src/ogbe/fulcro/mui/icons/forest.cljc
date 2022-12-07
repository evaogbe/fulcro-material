(ns ogbe.fulcro.mui.icons.forest
  #?(:cljs (:require
            ["@mui/icons-material/Forest" :default Forest]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-forest
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Forest)))