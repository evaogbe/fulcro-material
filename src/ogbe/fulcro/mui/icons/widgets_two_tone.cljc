(ns ogbe.fulcro.mui.icons.widgets-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WidgetsTwoTone" :default WidgetsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-widgets-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WidgetsTwoTone)))