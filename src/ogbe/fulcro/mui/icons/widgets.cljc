(ns ogbe.fulcro.mui.icons.widgets
  #?(:cljs (:require
            ["@mui/icons-material/Widgets" :default Widgets]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-widgets
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Widgets)))