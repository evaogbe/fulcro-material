(ns ogbe.fulcro.mui.icons.sticky-note2
  #?(:cljs (:require
            ["@mui/icons-material/StickyNote2" :default StickyNote2]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sticky-note2
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StickyNote2)))