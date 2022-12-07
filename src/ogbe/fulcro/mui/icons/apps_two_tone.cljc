(ns ogbe.fulcro.mui.icons.apps-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AppsTwoTone" :default AppsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-apps-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppsTwoTone)))