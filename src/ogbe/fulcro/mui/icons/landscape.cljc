(ns ogbe.fulcro.mui.icons.landscape
  #?(:cljs (:require
            ["@mui/icons-material/Landscape" :default Landscape]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-landscape
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Landscape)))