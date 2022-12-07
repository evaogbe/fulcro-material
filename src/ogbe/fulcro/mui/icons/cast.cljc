(ns ogbe.fulcro.mui.icons.cast
  #?(:cljs (:require
            ["@mui/icons-material/Cast" :default Cast]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cast
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cast)))