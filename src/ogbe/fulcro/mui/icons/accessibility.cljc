(ns ogbe.fulcro.mui.icons.accessibility
  #?(:cljs (:require
            ["@mui/icons-material/Accessibility" :default Accessibility]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessibility
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Accessibility)))