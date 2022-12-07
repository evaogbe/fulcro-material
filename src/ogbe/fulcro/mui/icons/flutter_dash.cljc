(ns ogbe.fulcro.mui.icons.flutter-dash
  #?(:cljs (:require
            ["@mui/icons-material/FlutterDash" :default FlutterDash]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flutter-dash
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlutterDash)))