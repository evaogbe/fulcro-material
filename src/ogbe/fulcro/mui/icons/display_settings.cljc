(ns ogbe.fulcro.mui.icons.display-settings
  #?(:cljs (:require
            ["@mui/icons-material/DisplaySettings" :default DisplaySettings]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-display-settings
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DisplaySettings)))